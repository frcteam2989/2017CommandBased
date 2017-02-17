package org.usfirst.frc.team2989.robot.subsystems;

import org.usfirst.frc.team2989.robot.RobotMap;
import org.usfirst.frc.team2989.robot.commands.LiftCommand;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LiftMechanism extends Subsystem {
	public TalonSRX liftTalon = new TalonSRX(RobotMap.TALON_LIFT_1);
	public TalonSRX liftTalon2 = new TalonSRX(RobotMap.TALON_LIFT_2);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new LiftCommand());
    }
    
    public void runLift(double speed) {
    	liftTalon.setSpeed(speed);
    	liftTalon2.setSpeed(speed);
    }
}

