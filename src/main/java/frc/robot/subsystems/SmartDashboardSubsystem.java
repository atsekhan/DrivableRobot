// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotContainer;

public class SmartDashboardSubsystem extends SubsystemBase {
  /** Creates a new SmartDashboardSubsystem. */
  public SmartDashboardSubsystem() {
    SmartDashboard.putString("Friendly", "Good Morning!");
  }

  public void updateIMUValues() {
    SmartDashboard.putString("IMU1", "IMU1!");
    
    SmartDashboard.putString("IMU-Y-P-R", String.format("%f",
     RobotContainer.imuSubsystem.getYaw()) + " " + String.format("%f",
     RobotContainer.imuSubsystem.getPitch()) + " " + String.format("%f",
     RobotContainer.imuSubsystem.getRoll()));
     
    //SmartDashboard.putNumber("IMU-Yaw", RobotContainer.imuSubsystem.getYaw());
  }

  public void updateAllDisplays() {
    updateIMUValues();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    updateAllDisplays();
  }
}
