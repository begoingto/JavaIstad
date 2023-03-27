package generic;

public class MyData<T, U> {
    private T data;
    private U message;

    MyData(){}

    public MyData(T data, U message) {
        this.data = data;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public U getMessage(){
        return message;
    }
}
