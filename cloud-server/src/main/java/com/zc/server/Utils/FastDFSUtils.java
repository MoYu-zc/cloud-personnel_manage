package com.zc.server.Utils;

import com.sun.org.apache.regexp.internal.RE;
import org.csource.fastdfs.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * FastDFS工具类
 * <p>
 * Create at 2021/5/24 0:15
 *
 * @author MoYu
 * @version 1.0.0
 * @since 1.0.0
 */
public class FastDFSUtils {

    private static Logger logger = LoggerFactory.getLogger(FastDFSUtils.class);

    static {
        try {
            String filePath = new ClassPathResource("fdfs_client.conf").getFile().getAbsolutePath();
            ClientGlobal.init(filePath);
        } catch (Exception e) {
            logger.error("初始化FastDFS失败", e.getMessage());
        }
    }

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    public static String[] upload(MultipartFile file) {
        String name = file.getOriginalFilename();
        logger.info("文件名：", name);
        StorageClient storageClient = null;
        String[] uploadResults = null;

        try {
            //获取 Storage客户端
            storageClient = getStorageClient();
            //上传   文件字节码、文件后缀名、文件描述信息
            uploadResults = storageClient.upload_file(file.getBytes(),
                    name.substring(name.lastIndexOf(".") + 1), null);
        } catch (Exception e) {
            logger.error("上传文件失败", e.getMessage());
        }
        if (null == uploadResults) {
            logger.error("上传失败", storageClient.getErrorCode());
        }
        return uploadResults;
    }

    /**
     * 获取文件信息
     *
     * @param groupName
     * @param remoteFileName
     * @return
     */
    public static FileInfo getFileInfo(String groupName, String remoteFileName) {
        StorageClient storageClient = null;
        try {
            storageClient = getStorageClient();
            return storageClient.get_file_info(groupName, remoteFileName);
        } catch (Exception e) {
            logger.error("文件信息获取失败", e.getMessage());
        }
        return null;
    }

    /**
     * 下载文件
     *
     * @param groupName
     * @param remoteFileName
     * @return
     */
    public static InputStream downFile(String groupName, String remoteFileName) {
        StorageClient storageClient = null;
        try {
            storageClient = getStorageClient();
            byte[] file = storageClient.download_file(groupName, remoteFileName);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(file);
            return inputStream;
        } catch (Exception e) {
            logger.error("文件下载失败", e.getMessage());
        }
        return null;
    }

    /**
     * 删除文件
     *
     * @param groupName
     * @param remoteFileName
     */
    public static void deleteFile(String groupName, String remoteFileName) {
        StorageClient storageClient = null;
        try {
            storageClient = getStorageClient();
            storageClient.delete_file(groupName, remoteFileName);
        } catch (Exception e) {
            logger.error("文件删除失败", e.getMessage());
        }

    }


    /**
     * 生成 Tracker服务器
     *
     * @return
     * @throws IOException
     */
    private static TrackerServer getTrackerServer() throws IOException {
        TrackerClient trackerClient = new TrackerClient();
        return trackerClient.getTrackerServer();
    }

    /**
     * 生成 Storage 客户端
     *
     * @return
     * @throws IOException
     */
    public static StorageClient getStorageClient() throws IOException {
        TrackerServer trackerServer = getTrackerServer();
        return new StorageClient(trackerServer, null);
    }

    /**
     * 获取文件路径
     * @return
     */
    public static String getTrackerUrl() {
        TrackerClient trackerClient = new TrackerClient();
        StorageServer storeStorage = null;
        try {
            storeStorage = trackerClient.getStoreStorage(trackerClient.getTrackerServer());
        } catch (Exception e) {
            logger.error("文件路径获取失败", e.getMessage());
        }
        return "http://"+storeStorage.getInetSocketAddress().getHostString()+":8888/";
    }


}

