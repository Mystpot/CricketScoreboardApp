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
public class Extras {
    
    private Integer extrasID;
    private String matchID;
    private String totalWides;
    private String totalNoballs;
    
    
    public Extras()
    {
        
    }
    
    public Extras(String matchID, String totalWides, String totalNoballs)
    {
        this.matchID = matchID;
        this.totalWides = totalWides;
        this.totalNoballs = totalNoballs;
    }
    
    public Integer getExtrasID() {
        return extrasID;
    }
    
    public void setExtrasID(Integer id) {
        extrasID = id;
    }

    public String getMatchID() 
    
    { return matchID; }
    
     public void setMatchID(String mid) {
        matchID = mid;
    }


    public String getTotalWides() {
        return totalWides;
    }
    
     public void setTotalWides(String tW) {
        totalWides = tW;
    }


    public String getTotalNoballs() {
        return totalNoballs;
    }
    
     public void setTotalNoballs(String tB) {
        totalNoballs = tB;
    } 
    
}
