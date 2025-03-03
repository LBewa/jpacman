package nl.tudelft.jpacman.game;

import java.util.ArrayList;
import java.util.List;

import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.points.PointCalculator;

/**
 * A game with one player and a single level.
 *
 * @author Jeroen Roosen 
 */
public class SinglePlayerGame extends Game {

    /**
     * The player of this game.
     */
    private final Player player;

    /**
     * The level of this game.
     */
    private final Level level;

    /**
     * Create a new single player game for the provided level and player.
     *
     * @param player
     *            The player.
     * @param level
     *            The level.
     * @param pointCalculator
     *            The way to calculate points upon collisions.
     */
    protected SinglePlayerGame(Player player, Level level, PointCalculator pointCalculator) {
        super(pointCalculator);

        assert player != null;
        assert level != null;

        this.player = player;
        this.level = level;
        this.level.registerPlayer(player);
        this.level.initInitalPositionUnit();

    }

    @Override
    public List<Player> getPlayers() {
        List<Player> lst = new ArrayList<>();
        lst.add(player);
        return lst;
    }

    @Override
    public Level getLevel() {
        return level;
    }
}
