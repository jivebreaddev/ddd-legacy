package racingcar.strategy;

public class StopStrategy implements MovingStrategy {
  @Override
  public boolean movable() {
    return false;
  }
}
