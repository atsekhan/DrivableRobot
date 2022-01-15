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

/**
 * Default settings set here are overwritten in
 * RobotContainer.configureRobotSettings()
 */

public final class Constants {

    public static enum RobotModel {
        FRANKENBOT, DEMOBOARD, C2021
    }

    public static enum DriveInterface {
        ONESTICK, SPLITSTICK, XBOX, XBOXANDSTICK
    }

    public static final class RobotProperties { // configure the type of robot here, such as presence/absence of a
                                                // device, device type etc

        public static boolean robotLogging = true; // if set to TRUE, enable logging to the USB stick via
                                                   // SimpleCSVLogging

        /**
         * Robot Types: FRANKENBOT (2 falcons, pneumatics, Navx) Demo Board (2 falcons,
         * no pneumatics, Pigeon)
         */

        public static final RobotModel robotModel = RobotModel.FRANKENBOT; // This setting must be set properly !!! It
                                                                          // controls the rest of the setup

        public static boolean isNaVX;
        public static DriveInterface driveInterface;
        public static boolean isPneumatics;

    }

    public static final class RobotDriveChassisConstants { // configure the physical properties unique to the robot
                                                           // here, such as
        // dimensions, wheel diameter etc
        public static int wheelDiameter = 6; // inches
        public static double distanceBetweenWheels = 20; // inches
        public static int encoderUnitsPerShaftRotation = 2048;
        public static double encoderGearReduction = 11.25;
        public static int encoderUnitsPerRobotRotation = 66500;// thats the SUM of the two (this is just a rough
                                                               // guess, and should be measured)
    }

    public static final class TrajectoryDriving { // constants related to the trajectory driving

        public final static double trajectoryRioPidP_Value = 1.43;// * RobotMap.fullMotorOutput /
                                                                  // encoderUnitsPerShaftRotation;
        public final static double trajectoryRioPidI_Value0 = 0.00;// * RobotMap.fullMotorOutput /
                                                                   // encoderUnitsPerShaftRotation;
        public final static double trajectoryRioPidD_Value0 = 0;

        public final static double feedForwardStatic = 0.541;
        public final static double feedForwardVelocity = 0.305;
        public final static double feedForwardAcceleration = 0.0362;

        // We will leave these here for now. However, if we plan to do multiple
        // independents autonomous paths,
        // we will need means to set them in the NavigationControlSubsystem constructor
        // if needed
        // resetPose method would reset a pose to the initial one with coordinates
        // listed here, facing "east"
        public static double startingPoseX = 0.9144;
        // Note that the Slalom path requires a different value
        public static double startingPoseY = 2.286;

    }

    public static final class DriveConstants {
        public static int[] leftMotorPortID = new int[] { 1 };
        public static int[] rightMotorPortID = new int[] { 2 };

        public static int[] kLeftEncoderPorts = new int[] { 1 };
        public static int[] kRightEncoderPorts = new int[] { 2 };
        public static boolean kLeftEncoderReversed = false;
        public static boolean kRightEncoderReversed = true;

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

        // Deadband values
        public final static double deadbandX = 0.1;
        public final static double deadbandY = 0.1;
        public final static double deadbandZ = 0.1;

        // The difference between the left and right side encoder values when the robot
        // is rotated 180 degrees
        // Allowable error to exit movement methods
        public static int defaultAcceptableError = 250;

        // Make smoother turns - see Cheezy Driving
        public static double turnAdjust = 0.6;

    }

    public static final class OIConstants {
        public static final int driverControllerPort = 0;
        public static final int turnControllerPort = 1;
        public static final int xboxControllerPort = 1;
    }

    public static final class PigeonIMU {
        // If you have PigeonIMU, this is the ID of the Talon SRX the IMU is connected
        // to
        public static int pigeonIMUId;
    }

    public static final class PneumaticsConstants {

        public static int compressorCANID;

        // index 0 is forward channel
        // index 1 is reverse channel
        public static int[] SolenoidChannel ;
    }

    public static final int TeamNumber = 999;
}
