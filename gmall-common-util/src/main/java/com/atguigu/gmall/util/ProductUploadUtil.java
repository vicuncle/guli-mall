package com.atguigu.gmall.util;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;


public class ProductUploadUtil {
    public static final String BASE_URL = "http://192.168.83.102";
    public static String uploadImage(MultipartFile file) {
        StringBuilder sb = new StringBuilder(BASE_URL);
        String path = ProductUploadUtil.class.getResource("/tracker.conf").getPath();

        try {
            ClientGlobal.init(path);
            TrackerClient trackerClient = new TrackerClient();
            TrackerServer trackerServer = trackerClient.getTrackerServer();
            StorageClient storageClient = new StorageClient(trackerServer, null);
            byte[] bytes = file.getBytes();
            String originalFilename = file.getOriginalFilename();
            String ext = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            String[] urls = storageClient.upload_appender_file(bytes, ext, null);
            for (String url : urls) {
                sb.append("/").append(url);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
