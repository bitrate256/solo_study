package chapter_01;

public class B_variable_03 {
    // 전역변수는 선언과 초기화를 반드시 한번에 해야 함.
    int j = 10;
    /* int j; 에러임, 왜냐하면 선언과 초기화를 나누어 할 수 없다.(컴파일 에러)
     * j = 20;
     */
     //지역변수는 반드시 메소드 안에서 선언되거나 파라미터 자리에 선언해야 함
    public void methodA() {
           int j;//지역변수임 - 지변은 선언과 초기화를 나누어 작성할 수 있음.
           j = 20;
    }
    /*
     * 로그인을 사용자(업무담당자)가 입력하면 그 값이 오라클 서버에 전달되어야 함.
     * 오라클에서 아래 select문 실행[요청]
     * select mem_name FROM member
     * WHERE mem_id=? AND mem_pw=?
     */
    public String loginAction(String mem_id, String mem_pw) {
           return "이순신님 환영합니다.";
    }
    public static void main(String[] args) {
           B_variable_03 p = new B_variable_03();
           String mem_name = p.loginAction("test", "123");
           System.out.println(mem_name);
    }
}