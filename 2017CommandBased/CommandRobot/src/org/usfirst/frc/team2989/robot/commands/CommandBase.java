package org.usfirst.frc.team2989.robot.commands;

import org.usfirst.frc.team2989.robot.OI;
import org.usfirst.frc.team2989.robot.RobotMap;
import org.usfirst.frc.team2989.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {
	public static DriveTrain driveTrain = new DriveTrain();
	public static AnalogGyro gyro = new AnalogGyro(RobotMap.ANALOG_PORT);
	public static OI oi;
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	public static void init() {
		oi = new OI();
	}
}
