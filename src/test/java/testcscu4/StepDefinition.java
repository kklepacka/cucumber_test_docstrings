package testcscu4;

import cucumber.api.java.en.Given;

public class StepDefinition {

    @Given("test '")
    public void test1(String docString) {

        System.out.println("test");
    }

    @Given("Test ` echo test `")
    public void test2(String docString) {

        System.out.println("test");
    }

    @Given("Test $test")
    public void test3(String docString) {

        System.out.println("test");
    }

    @Given("Test & echo toto")
    public void test4(String docString) {

        System.out.println("test");
    }

    @Given("Test ; echo toto")
    public void test5(String docString) {

        System.out.println("test");
    }

    @Given("Test | echo toto")
    public void test6(String docString) {

        System.out.println("test");
    }

    @Given("Test ^")
    public void test7(String docString) {

        System.out.println("test");
    }

    @Given("Test %test%")
    public void test8(String docString) {

        System.out.println("test");
    }

    @Given("Test $\\{echo test}")
    public void test9(String docString) {

        System.out.println("test");
    }

    @Given("Test $\\(echo test)")
    public void test10(String docString) {

        System.out.println("test");
    }

    @Given("Test #test")
    public void test11(String docString) {

        System.out.println("test");
    }

    @Given("Test 𨱏")
    public void test12(String docString) {

        System.out.println("test");
    }

    @Given("Test 👩‍❤️‍💋‍👨")
    public void test13(String docString) {

        System.out.println("test");
    }

    @Given("Test [test]")
    public void test14(String docString) {

        System.out.println("test");
    }

    @Given("Test ^^")
    public void test15(String docString) {

        System.out.println("test");
    }

    @Given("Test ,.+-_~@€çé=àû*?!")
    public void test16(String docString) {

        System.out.println("test");
    }

    @Given("Test .\\/test")
    public void test17(String docString) {

        System.out.println("test");

    }
}
