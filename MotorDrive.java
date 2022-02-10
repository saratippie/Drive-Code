// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class MotorDrive extends CommandBase {
  /** Creates a new MotorDrive. */
  public MotorDrive() {
    addRequirements(Robot.drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftjoyY = Robot.m_robotContainer.GetleftjoyRawAxis(Constants.LEFT_JOYSTICK_YID);
    double RightjoyY = Robot.m_robotContainer.GetRightjoyRawAxis(Constants.RIGHT_JOYSTICK_YID);

    Robot.drivetrain.setrightmotor(RightjoyY*.5);
    Robot.drivetrain.setleftmotor(leftjoyY*.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.drivetrain.setleftmotor(0);
    Robot.drivetrain.setrightmotor(0);
    this.end(interrupted);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
