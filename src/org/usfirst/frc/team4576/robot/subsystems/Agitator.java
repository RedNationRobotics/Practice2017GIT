package org.usfirst.frc.team4576.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Agitator extends Subsystem {

	public Agitator() {
	}

	CANTalon tsrxA = new CANTalon(6);

	@Override
	protected void initDefaultCommand() {

	}

	public void agitatorGo() {
		tsrxA.set(1); // shooterWheelR.set(1);

	}

	public void agitatorStop() {
		// shooterElevL.set(0);
		tsrxA.set(0);

	}

}