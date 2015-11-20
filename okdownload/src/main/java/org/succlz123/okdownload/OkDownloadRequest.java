package org.succlz123.okdownload;

import com.squareup.okhttp.OkHttpClient;

/**
 * Created by succlz123 on 15/9/11.
 */
public class OkDownloadRequest {
    private int id;

    private String url;

    private String filePath;

    private long startTime;

    private long finishTime;
    /**
     * Not required
     */
//    private long cacheSize;

    private long fileSize;
    /**
     * Content-Type: text/HTML
     */
    private String mimeType;

    private int status;

    private String title;

    private String description;

    private OkHttpClient okHttpClient;

    public OkDownloadRequest() {
    }

    private OkDownloadRequest(Builder builder) {
        id = builder.id;
        url = builder.url;
        filePath = builder.filePath;
        mimeType = builder.mimeType;
        title = builder.title;
        description = builder.description;
        okHttpClient = builder.okHttpClient;
    }

    public OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }

    public void setOkHttpClient(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    public long getCacheSize() {
//        return cacheSize;
//    }
//
//    public void setCacheSize(long cacheSize) {
//        this.cacheSize = cacheSize;
//    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static class Builder {
        private int id;
        private String url;
        private String filePath;
        private String mimeType;
        private String title;
        private String description;
        private OkHttpClient okHttpClient;

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder setOkHttpClient(OkHttpClient okHttpClient) {
            this.okHttpClient = okHttpClient;
            return this;
        }

        public OkDownloadRequest build() {
            return new OkDownloadRequest(this);
        }
    }
}
