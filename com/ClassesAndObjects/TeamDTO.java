package com.ClassesAndObjects;
public class PlayerDTO {
    
    private String name;
    private String position;
    private int jerseyNumber;

    public PlayerDTO(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void playGame() {
        
    }

    public void train(){
        
    }
    public String toString() {
        return String.format("| %-20s : %-25s|\n" +
                             "| %-20s : %-25s|\n" +
                             "| %-20s : %-25d|", 
                             "Player Name", name, 
                             "Position", position, 
                             "Jersey Number", jerseyNumber);
    }
}
///////////////////////////////////////////
import java.util.ArrayList;
import java.util.List;

public class TeamDTO {

    private String name;
    private String city;
    private String division;
    private List<PlayerDTO> players;

    public TeamDTO(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void addPlayer(PlayerDTO player) {
        players.add(player);
    }

    public void hireCoach() {
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------------------\n")
          .append(String.format("| %-20s : %-25s|\n", "Team Name", name))
          .append(String.format("| %-20s : %-25s|\n", "City", city))
          .append(String.format("| %-20s : %-25s|\n", "Division", division))
          .append("--------------------------------------------------------\n")
          .append("Players:\n");

        for (PlayerDTO player : players) {
            sb.append(player.toString()).append("\n");
        }
        sb.append("--------------------------------------------------------");
        return sb.toString();
    }
}



