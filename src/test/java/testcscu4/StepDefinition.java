package testcscu4;

import io.cucumber.java.en.When;

public class StepDefinition {

    @When("test '")
    public void test1(String docString) {

        System.out.println("test");
    }

    @When("Test ` echo test `")
    public void test2(String docString) {

        System.out.println("test");
    }

    @When("Test $test")
    public void test3(String docString) {

        System.out.println("test");
    }

    @When("Test & echo toto")
    public void test4(String docString) {

        System.out.println("test");
    }

    @When("Test ; echo toto")
    public void test5(String docString) {

        System.out.println("test");
    }

    @When("Test | echo toto")
    public void test6(String docString) {

        System.out.println("test");
    }

    @When("Test ^")
    public void test7(String docString) {

        System.out.println("test");
    }

    @When("Test %test%")
    public void test8(String docString) {

        System.out.println("test");
    }

    @When("Test $\\{echo test}")
    public void test9(String docString) {

        System.out.println("test");
    }

    @When("Test $\\(echo test)")
    public void test10(String docString) {

        System.out.println("test");
    }

    @When("Test #test")
    public void test11(String docString) {

        System.out.println("test");
    }

    @When("Test 𨱏")
    public void test12(String docString) {

        System.out.println("test");
    }

    @When("Test 👩‍❤️‍💋‍👨")
    public void test13(String docString) {

        System.out.println("test");
    }

    @When("Test [test]")
    public void test14(String docString) {

        System.out.println("test");
    }

    @When("Test ^^")
    public void test15(String docString) {

        System.out.println("test");
    }

    @When("Test ,.+-_~@€çé=àû*?!")
    public void test16(String docString) {

        System.out.println("test");
    }

    @When("Test .\\/test")
    public void test17(String docString) {

        System.out.println("test");

    }
}
