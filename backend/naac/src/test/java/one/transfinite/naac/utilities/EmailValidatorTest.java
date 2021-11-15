package one.transfinite.naac.utilities;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {EmailValidator.class})
@ExtendWith(SpringExtension.class)
class EmailValidatorTest {
    @Autowired
    private EmailValidator emailValidator;

    @Test
    void testTest() {
        assertFalse(this.emailValidator.test("foo"));
    }
}

