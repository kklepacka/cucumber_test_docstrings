# language: en
Feature: KKL_test_docstr

	Scenario: KKL_test_docstr
		Given Test \"
			"""
			Test "
			"""
		Given Test \< /tmp
			"""
			Test < /tmp
			"""
		Given Test \> /tmp
			"""
			Test > /tmp
			"""
		Given Test 'test'
			"""
			Test 'test'
			"""
		Given Test $test
			"""
			Test $test
			"""
		Given Test \\
			"""
			Test \
			"""
		Given Test /
			"""
			Test /
			"""