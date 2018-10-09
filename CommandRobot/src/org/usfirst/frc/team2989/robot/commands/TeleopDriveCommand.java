package org.usfirst.frc.team2989.robot.commands;

import org.usfirst.frc.team2989.robot.Robot;
import org.usfirst.frc.team2989.robot.RobotMap;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TeleopDriveCommand extends Command {
	
	
	ADXRS450_Gyro gyro;	
	public TeleopDriveCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveTrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		gyro = new ADXRS450_Gyro();
		gyro.reset();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		//correctedR = Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_Y) - .1;
		//SmartDashboard.putNumber("Joystick X", Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_X));
		//SmartDashboard.putNumber("Joystick Y", Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_RIGHT_X));
		//SmartDashboard.putNumber("Joystick Rotation", Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_Y));
		//SmartDashboard.putNumber("Gyro Value", Robot.gyro.getAngle());
		double Kp = 0.03;
		double angle = gyro.getAngle();
		Robot.driveTrain.driveRobot(Robot.oi.getXboxController().getRawAxis(0), Robot.oi.getXboxController().getRawAxis(1), Robot.oi.getJoystick2().getRawAxis(0), -angle*Kp);
		// Robot.driveTrain.driveRobot(Robot.oi.getXboxController().getRawAxis(1), Robot.oi.getXboxController().getRawAxis(0), Robot.oi.getJoystick2().getRawAxis(0));
		// , Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_RIGHT_X), Robot.oi.getXboxController().getRawAxis(RobotMap.JOYSTICK_LEFT_Y), 
		Timer.delay(.02);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
