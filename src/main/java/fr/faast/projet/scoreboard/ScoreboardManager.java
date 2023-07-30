package fr.faast.projet.scoreboard;

import fr.faast.projet.Main;
import io.github.thatkawaiisam.assemble.Assemble;

public class ScoreboardManager {

    private Assemble scoreboard;

    public ScoreboardManager() {
        this.scoreboard = new Assemble(Main.getInstance(),new ScoreboardAdapter());

        this.scoreboard.setTicks(1);
    }

    public Assemble getScoreboard() {
        return scoreboard;
    }
}
