package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.MotorDrive;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private TalonFX LeftMotor1 = new TalonFX(Constants.LEFT_MOTOR_1ID);
  private TalonFX LeftMotor2 = new TalonFX(Constants.LEFT_MOTOR_2ID);
  private TalonFX RightMotor1 = new TalonFX(Constants.RIGHT_MOTOR_1ID);
  private TalonFX RightMotor2 = new TalonFX(Constants.RIGHT_MOTOR_2ID);
  public DriveTrain() {}

  @Override
  public void periodic() {
    setDefaultCommand(new MotorDrive());
    // This method will be called once per scheduler run
  }
  public void setleftmotor(double speed){
    LeftMotor1.set(ControlMode.PercentOutput, -speed);
    LeftMotor2.set(ControlMode.PercentOutput, -speed);
  }
  public void setrightmotor(double speed){
    RightMotor1.set(ControlMode.PercentOutput, speed);
    RightMotor2.set(ControlMode.PercentOutput, speed);

  }
}
