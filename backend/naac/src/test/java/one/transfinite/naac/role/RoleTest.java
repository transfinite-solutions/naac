package one.transfinite.naac.role;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RoleTest {
    @Test
    void testConstructor() {
        Role actualRole = new Role();
        actualRole.setId(123L);
        actualRole.setRoleName(RoleName.Admin);
        assertEquals(123L, actualRole.getId().longValue());
        assertEquals(RoleName.Admin, actualRole.getRoleName());
        assertEquals("Role(id=123, roleName=Admin)", actualRole.toString());
    }

    @Test
    void testConstructor2() {
        Role actualRole = new Role(123L, RoleName.Admin);
        actualRole.setId(123L);
        actualRole.setRoleName(RoleName.Admin);
        assertEquals(123L, actualRole.getId().longValue());
        assertEquals(RoleName.Admin, actualRole.getRoleName());
        assertEquals("Role(id=123, roleName=Admin)", actualRole.toString());
    }
}

