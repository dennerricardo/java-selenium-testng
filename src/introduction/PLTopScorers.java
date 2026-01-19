package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PLTopScorers {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Denner Ricardo/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        List<GoalRanking> rankings = new ArrayList<>();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.premierleague.com/en/stats/top/players?statMetric=goals&season=2025");
        List<WebElement> rows = driver.findElements(By.cssSelector("table tbody tr"));

        System.out.println(rows.size());

        for (WebElement row  : rows){
           String rank = row.findElement(By.xpath(".//span[@class='stats-table__pos pos-cell']")).getText();
           String player = row.findElement(By.xpath(".//span[@class='stats-table__name']")).getText();
           String team = row.findElement(By.xpath(".//div[@class='stats-table__player-team-meta']")).getText();
           String goals = row.findElement(By.xpath(".//span[@class='stats-table__stat-value stat-value-cell']")).getText();

           GoalRanking ranking = new GoalRanking();
           ranking.setPlayerName(player);
           ranking.setTeam(team);
           ranking.setRankPosition(Integer.parseInt(rank));
           ranking.setGoals(Integer.parseInt(goals));

           System.out.println(ranking);

           rankings.add(ranking);


        }
        System.out.println(rankings);


        driver.quit();
   }

}
