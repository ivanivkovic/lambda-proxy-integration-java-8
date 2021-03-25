package my.pojo

import groovy.transform.Canonical

@Canonical

class RequestBody {
    private Integer id
    private String date
    private String url

    RequestBody(Integer id, String date, String url) {
        this.id = id
        this.date = date
        this.url = url
    }

    void setId(Integer id) {
        this.id = id
    }

    void setDate(String date) {
        this.date = date
    }

    void setUrl(String url) {
        this.url = url
    }

    Integer getId() {
        return id
    }

    String getDate() {
        return date
    }

    String getUrl() {
        return url
    }

    RequestBody(){

    }
}
