package org.usfirst.frc.team2989.robot.subsystems;

import org.usfirst.frc.team2989.robot.RobotMap;
import org.usfirst.frc.team2989.robot.commands.TeleopDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public static RobotDrive robotDrive = new RobotDrive(RobotMap.MOTOR_LEFT_FRONT, RobotMap.MOTOR_LEFT_REAR, RobotMap.MOTOR_RIGHT_FRONT, RobotMap.MOTOR_RIGHT_REAR);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new TeleopDriveCommand());
	}
	
	public void driveRobot(double x, double y, double rotation, double angle) {
		robotDrive.mecanumDrive_Cartesian(x, y, rotation, angle);
	}
}
