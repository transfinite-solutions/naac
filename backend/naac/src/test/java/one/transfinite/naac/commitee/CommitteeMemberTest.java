package one.transfinite.naac.commitee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CommitteeMemberTest {
    @Test
    void testConstructor() {
        CommitteeMember actualCommitteeMember = new CommitteeMember();
        actualCommitteeMember.setCommitteeMemberRole(CommitteeMemberRole.Chairman);
        actualCommitteeMember.setEmailId("42");
        actualCommitteeMember.setId(123L);
        actualCommitteeMember.setMemberName("Member Name");
        actualCommitteeMember.setMobileNo("Mobile No");
        assertEquals(CommitteeMemberRole.Chairman, actualCommitteeMember.getCommitteeMemberRole());
        assertEquals("42", actualCommitteeMember.getEmailId());
        assertEquals(123L, actualCommitteeMember.getId().longValue());
        assertEquals("Member Name", actualCommitteeMember.getMemberName());
        assertEquals("Mobile No", actualCommitteeMember.getMobileNo());
        assertEquals("CommitteeMember(id=123, memberName=Member Name, committeeMemberRole=Chairman, mobileNo=Mobile No,"
                + " emailId=42)", actualCommitteeMember.toString());
    }

    @Test
    void testConstructor2() {
        CommitteeMember actualCommitteeMember = new CommitteeMember(123L, "Member Name", CommitteeMemberRole.Chairman,
                "Mobile No", "42");
        actualCommitteeMember.setCommitteeMemberRole(CommitteeMemberRole.Chairman);
        actualCommitteeMember.setEmailId("42");
        actualCommitteeMember.setId(123L);
        actualCommitteeMember.setMemberName("Member Name");
        actualCommitteeMember.setMobileNo("Mobile No");
        assertEquals(CommitteeMemberRole.Chairman, actualCommitteeMember.getCommitteeMemberRole());
        assertEquals("42", actualCommitteeMember.getEmailId());
        assertEquals(123L, actualCommitteeMember.getId().longValue());
        assertEquals("Member Name", actualCommitteeMember.getMemberName());
        assertEquals("Mobile No", actualCommitteeMember.getMobileNo());
        assertEquals("CommitteeMember(id=123, memberName=Member Name, committeeMemberRole=Chairman, mobileNo=Mobile No,"
                + " emailId=42)", actualCommitteeMember.toString());
    }
}

