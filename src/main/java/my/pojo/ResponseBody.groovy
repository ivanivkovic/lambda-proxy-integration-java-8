package my.pojo

class ResponseBody {

    private Integer status
    private String message

    ResponseBody(Integer status, String message) {
        this.status = status
        this.message = message
    }

    void setStatus(Integer status) {
        this.status = status
    }

    Integer getStatus() {
        return this.status
    }

    void setMessage(String message) {
        this.message = message
    }

    String getMessage() {
        return this.message
    }

    ResponseBody() {

    }
}