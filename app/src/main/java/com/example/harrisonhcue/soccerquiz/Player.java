package com.example.harrisonhcue.soccerquiz;

/**
 * Created by HcUE on 2017-12-07.
 */

public class Player {
    private String name;
    private String teamName;

    Player(String name,String teamName){

        this.name=name;
        this.setTeamName(teamName);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void recordScore(){
        /* TODO:Implement Player score recording in to SQL database  */
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
