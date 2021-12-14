// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class RobotProperties { // configure the type of robot here
        public static boolean isNaVX = false;
    }

    public static final class DriveConstants {
        public static final int[] leftMotorPortID = new int[] { 1 };
        public static final int[] rightMotorPortID = new int[] { 2 };

        public static final int[] kLeftEncoderPorts = new int[] { 1 };
        public static final int[] kRightEncoderPorts = new int[] { 2 };
        public static final boolean kLeftEncoderReversed = false;
        public static final boolean kRightEncoderReversed = true;

        public static final int kEncoderCPR = 1024;
        public static final double kWheelDiameterInches = 6;
        public static final double kEncoderDistancePerPulse =
                // Assumes the encoders are directly mounted on the wheel shafts
                (kWheelDiameterInches * Math.PI) / (double) kEncoderCPR;

        // MotionMagic constants section

        // Closed loop constants
        // How long we wait for a configuration change to happen before we give up and
        // report a failure in milliseconds
        public final static int configureTimeoutMs = 30;
        // Full motor output value
        public final static int fullMotorOutput = 1023;
        // How many milliseconds between each closed loop call
        public final static int closedLoopPeriodMs = 1;
        // Motor neutral dead-band, set to the minimum 0.1%
        public final static double NeutralDeadband = 0.001;

        public final static int Izone_0 = 500;
        public final static double PeakOutput_0 = 1;

        /**
         * Talon PID methods often demand slot ID's, so we wil keep this here I do not
         * think we actually need it with Falcons anymore
         */
        public final static int SLOT_0 = 0;

        // Gains for MotionMagic
        public final static double motionMagicPidP_Value = 0.75;// * fullMotorOutput / encoderUnitsPerShaftRotation;
        public final static double motionMagicPidI_Value = 0.005;// * fullMotorOutput / encoderUnitsPerShaftRotation;
        public final static double motionMagicPidD_Value = 0.01;
        public final static double motionMagicPidF_Value = 2;

        public final static int motionMagicCruiseVelocity = 2250 * 3;
        public final static int motionMagicAcceleration = 2250 * 3;
        public final static int motionMagicSmoothing = 3;
    }

    public static final class OIConstants {
        public static final int driverControllerPort = 0;
    }

    public static final class PigeonIMU {
        // If you have PigeonIMU, this is the ID of the Talon SRX the IMU is connected
        // to
        public static final int pigeonIMUId = 3;
    }

}
