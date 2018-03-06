import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PasswordValidatorTest {

    @Test
    public void valid_test() {
        assert_validation_of_password("hOLAqUEaSE8_pQ_SI_jOñpUTA");
    }

    @Test
    public void should_not_have_more_than_eight_characters() {
        assert_not_validation_of_password("a_1A1239");
    }

    @Test
    public void should_have_more_than_eight_characters() {
        assert_validation_of_password("a_1A12398");
    }

    @Test
    public void should_not_contain_atleast_one_lower_letter() {
        assert_not_validation_of_password("HOLA1_23G");
    }

    @Test
    public void should_not_contain_atleast_one_capital_letter() {
        assert_not_validation_of_password("holaqease1_");
    }

    @Test
    public void should_not_contain_atleast_one_number() {
        assert_not_validation_of_password("HolaQueAse_");
    }

    @Test
    public void should_not_contain_atleast_one_anderscore() {
        assert_not_validation_of_password("HolaQueAse8");
    }

    private void assert_validation_of_password(String password) {
        assertEquals(true, validate(password));
    }

    private void assert_not_validation_of_password(String password) {
        assertEquals(false, validate(password));
    }

    private boolean validate(String password) {
        PasswordValidator passwordValidator = new PasswordValidator(password);
        return passwordValidator.isValid();
    }

}
