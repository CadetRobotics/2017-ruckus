package org.usfirst.frc.team340.robot.commands.climb.manual;

import org.usfirst.frc.team340.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ManualGoAtClimbSpeed extends Command {

    public ManualGoAtClimbSpeed() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.climber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
//    	System.out.println("initialize ManualGoAtClimbSpeed");
    	Robot.climber.goAtClimbSpeed();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	System.out.println("current draw motor 1 ;" + Robot.climber.getCurrentDrumOne() 
//			+ "; motor 2 ;" + Robot.climber.getCurrentDrumTwo() + ";"); 
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.climber.goStopped();
//    	System.out.println("end ManualGoAtClimbSpeed");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
