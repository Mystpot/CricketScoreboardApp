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
public class TotalScore {
    
    private Integer totalScoreID;
    private String matchID;
    private String totalScore;
    private String totalWickets;
    private String totalOvers;
    
    
    public TotalScore()
    {
        
    }
    
    public TotalScore(String matchID, String totalScore, String totalWickets, String totalOvers)
    {
        this.matchID = matchID;
        this.totalScore = totalScore;
        this.totalWickets = totalWickets;
        this.totalOvers = totalOvers;
    }
    
    public Integer getTotalScoreID() {
        return totalScoreID;
    }
    
    public void setTotalScoreID(Integer id) 
    {
        totalScoreID = id;
    }

    public String getMatchID() 
    
    { return matchID; }
    
     public void setMatchID(String mid) {
        matchID = mid;
    }


    public String getTotalScore() {
        return totalScore;
    }
    
     public void setTotalScore(String tS) {
        totalScore = tS;
    }


    public String getTotalWickets() {
        return totalWickets;
    }
    
     public void setTotalWickets(String tW) {
        totalWickets = tW;
    }


    public String getTotalOvers() {
        return totalOvers;
    }
    
     public void setTotalOvers(String tO) {
        totalOvers = tO;
    }   
}
