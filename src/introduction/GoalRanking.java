package introduction;

public class GoalRanking {


        private String playerName;
        private String team;
        private int rankPosition;
        private int goals;

        public String getPlayerName() {
            return playerName;
        }

        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }

        public String getTeam() {
            return team;
        }

        public void setTeam(String team) {
            this.team = team;
        }

        public int getRankPosition() {
            return rankPosition;
        }

        public void setRankPosition(int rank_position) {
            this.rankPosition = rank_position;
        }

        public int getGoals() {
            return goals;
        }

        public void setGoals(int goals) {
            this.goals = goals;
        }

    @Override
    public String toString() {
        return "GoalRanking{" +
                "Rank=" + rankPosition +
                ", playerName='" + playerName + '\'' +
                ", team='" + team + '\'' +
                ", goals=" + goals +
                '}';
    }
}
