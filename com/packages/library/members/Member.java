package library.members;

public class Member {
    private static int memberCount = 0 ;

    private String memberName;
    private byte memberAge;
    private String memberID;

   
    public Member(String memberName, byte memberAge) {
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberID = generateMemberID();
        memberCount++; 
    }

    
    private String generateMemberID() {
        return "LIB" + String.format("%04d", memberCount + 1); // LIB0001, LIB0002, etc.
    }

  
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public byte getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(byte memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberID() {
        return memberID;
    }
    
    public static int getMemberCount() {
        return memberCount;
    }
    
      public String toString() {
        StringBuilder member = new StringBuilder();
        member.append("--------------------------------------------------------\n")
          .append(String.format("| %-20s : %-25s|\n", "Member Name", getMemberName()))
          .append(String.format("| %-20s : %-25s|\n", "Member Age", getMemberAge()))
          .append(String.format("| %-20s : %-25s|\n", "Member ID", getMemberID()))
          .append("--------------------------------------------------------");
        return member.toString();
    }
}

