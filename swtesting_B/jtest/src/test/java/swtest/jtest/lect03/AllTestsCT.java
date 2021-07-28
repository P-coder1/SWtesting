package swtest.jtest.lect03;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
// @IncludeCategory(FunctionGroup2Test.class) //()안에 있는 것을 포함된거 내가 실행할 카테고리만 지정할 때는IncludeCategory로 설정
@SuiteClasses({ simpleCalculatorTestCT1.class, 
	simpleCalculatorTestCT2.class,
		WeiredAddlnSimpleCalculatorTestCT3.class })
@ExcludeCategory(FunctionGroup2Test.class) // ()안에 있는 걸 제외한 나머지 카테고리를 실행한다.
public class AllTestsCT {

}
