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
public class Bowler {
    
    private Integer bowlersID;
    private String matchID;
    private String firstName;
    private String lastName;
    private String totalWickets;
    private String runsConceded;
    private String oversBowled;
    
    public Bowler()
    {
        
    }
    
    public Bowler(String matchID, String firstName, String lastName)
    {
        this.matchID = matchID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalWickets = totalWickets;
        this.runsConceded = runsConceded;
        this.oversBowled = oversBowled;
    }
    
    public Integer getBowlersID() {
        return bowlersID;
    }
    
    public void setBowlersID(Integer id) {
        bowlersID = id;
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


    public String getTotalWickets() {
        return totalWickets;
    }
    
     public void setTotalWickets(String tW) {
        totalWickets = tW;
    }


    public String getRunsConceded() {
        return runsConceded;
    }
    
     public void setRunsConceded(String rC) {
        runsConceded = rC;
    }
     
    public String getOversBowled() {
        return oversBowled;
    }
    
     public void setOversBowled(String oB) {
        oversBowled = oB;
    }

}
