package org.usfirst.frc.team2989.robot.subsystems;

import org.usfirst.frc.team2989.robot.RobotMap;
import org.usfirst.frc.team2989.robot.commands.TeleopDriveCommand;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public static RobotDrive myDrive = new RobotDrive(RobotMap.MOTOR_LEFT_FRONT, RobotMap.MOTOR_LEFT_REAR, RobotMap.MOTOR_RIGHT_FRONT, RobotMap.MOTOR_RIGHT_REAR);
	
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new TeleopDriveCommand());
		myDrive.setInvertedMotor(MotorType.kFrontLeft, true);
		myDrive.setInvertedMotor(MotorType.kRearLeft, true);
		myDrive.setExpiration(0.1);
	}
	
	public void driveRobot(double x, double y, double rotation, double gyro) {
		myDrive.mecanumDrive_Cartesian(x, y, rotation, gyro);
		// myDrive.arcadeDrive(-move, rotate);
	}

	//public void driveRobot(GenericHID xboxController, double rawAxis, GenericHID xboxController2, double rawAxis2) {
		// TODO Auto-generated method stub
		
	//}
}
