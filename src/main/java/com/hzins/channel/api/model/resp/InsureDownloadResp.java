/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */   
package com.hzins.channel.api.model.resp; 

/**
 * 
 * <p>
 * 保单下载
 * </p>
 *  
 * @author	hz15051252 
 * @date	2015年5月11日 下午3:38:53
 * @version
 */
public class InsureDownloadResp {
    
    // 文件名
    public String fileName;

    // 文件大小
    public long fileSize;

    // 类型
    public String contentType;

    // 文件流
    public String data;
    
    //流水号
    public String transNo;
    
    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    
    public String getFileName() {
        return fileName;
    }

    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    
    public long getFileSize() {
        return fileSize;
    }

    
    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    
    public String getContentType() {
        return contentType;
    }

    
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    
    public String getData() {
        return data;
    }

    
    public void setData(String data) {
        this.data = data;
    }
    
    

}
 