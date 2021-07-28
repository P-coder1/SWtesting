package ScoreProcess;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(FunctionGroupA.class)
@SuiteClasses(ScoreProcessTest1.class)
public class FunctionGroupA {

}
