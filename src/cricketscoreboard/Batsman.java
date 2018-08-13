/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricketscoreboard;

/**
 *
 * @author gemorgan
 */
public class Batsman {
    
    private Integer batsmanID;
    private String matchID;
    private String firstName;
    private String lastName;
    private String bowledBy;
    private String totalScore;
    private String ballsFaced;
    private String isOut;
    
    public Batsman()
    {
        
    }
    
    public Batsman(String matchID, String firstName, String lastName)
    {
        this.matchID = matchID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bowledBy = bowledBy;
        this.totalScore = totalScore;
        this.ballsFaced = ballsFaced;
        this.isOut = isOut;
    }
    
    public Integer getBatsmanID() {
        return batsmanID;
    }
    
    public void setBatsmanID(Integer id) {
        batsmanID = id;
    }

    public String getMatchID() 
    
    { return matchID; }
    
     public void setMatchID(String mid) {
        matchID = mid;
    }


    public String getFirstName() {
        return firstName;
    }
    
     public void setFirstName(String fn) {
        firstName = fn;
    }


    public String getLastName() {
        return lastName;
    }
    
     public void setLastName(String ln) {
        lastName = ln;
    }


    public String getBowledBy() {
        return bowledBy;
    }
    
     public void setBowledBy(String bBy) {
        bowledBy = bBy;
    }


    public String getTotalScore() {
        return totalScore;
    }
    
     public void setTotalScore(String tScore) {
        totalScore = tScore;
    }
     
    public String getBallsFaced() {
        return ballsFaced;
    }
    
     public void setBallsFaced(String bFaced) {
        ballsFaced = bFaced;
    }

    public String getIsOut() {
        return isOut;
    }
    
     public void setIsOut(String iO) {
        isOut = iO;
    }
}
