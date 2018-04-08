// MyRemoteService.aidl
package github.wzm.com.myaidl;

// Declare any non-default types here with import statements

interface MyRemoteService {

    /*获取书名*/
    void getBookName();
    /*设置书籍数目*/
    void setBookNumber(int number);
}
