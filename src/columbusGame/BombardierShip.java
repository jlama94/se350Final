package columbusGame;

import java.awt.Point;

/**
 * Concrete decorator class.<br/>
 * Ship can interact with the RedCoin and get additional stuff.
 */
public class BombardierShip extends ShipDecorator{
	Vessel navigable;
	RedCoin coin;
	OceanExplorer OE;
	
	/**
	 * Ship is now powered up with a laser.
	 * @param navigable
	 * @param oceanE
	 */
	public BombardierShip(Vessel navigable, OceanExplorer oceanE) {
		this.navigable = navigable;
		this.OE = oceanE;
		coin = (RedCoin) OE.redCoin;

	}
	
	/**
	 * Returns the current state of the Ship (with a laser).
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return navigable.getDescription() + " with rockets.";
	}

	@Override
	void moveRight() {
		// TODO Auto-generated method stub
		navigable.moveRight();
		if(this.getLocation().equals(coin.getLocationOfCoin())) {
			coin.resetCoinImage();
			coin.createCoin();
		}
	}

	@Override
	void moveLeft() {
		// TODO Auto-generated method stub
		navigable.moveLeft();
		if(this.getLocation().equals(coin.getLocationOfCoin())) {
			coin.resetCoinImage();
			coin.createCoin();
		}
	}

	@Override
	void moveUp() {
		// TODO Auto-generated method stub
		navigable.moveUp();
		if(this.getLocation().equals(coin.getLocationOfCoin())) {
			coin.resetCoinImage();
			coin.createCoin();
		}
	}

	@Override
	void moveDown() {
		// TODO Auto-generated method stub
		navigable.moveDown();
		if(this.getLocation().equals(coin.getLocationOfCoin())) {
			coin.resetCoinImage();
			coin.createCoin();
		}
	}
	/**
	 * Returns the current location of the powered up ship.
	 */
	@Override
	Point getLocation() {
		return navigable.getLocation();
	}
}