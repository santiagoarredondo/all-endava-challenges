using NLog;

namespace LogLibrary
{
    public class Log
    {
        /// <summary>
        /// Generates the properly connection for each log
        /// </summary>
        private static void ConfigureLog()
        {
            var config = new NLog.Config.LoggingConfiguration();
            var logfile = new NLog.Targets.FileTarget("logfile") { FileName = "log.txt" };
            var logconsole = new NLog.Targets.ConsoleTarget("logconsole");
            config.AddRule(LogLevel.Info, LogLevel.Fatal, logconsole);
            config.AddRule(LogLevel.Debug, LogLevel.Fatal, logfile);
            LogManager.Configuration = config;
        }

        /// <summary>
        /// Shows and write in the console an information message
        /// </summary>
        /// <param name="message"> message you want to show </param>
        public static void ShowInformationMessage(string message)
        {
            ConfigureLog();
            var logger = LogManager.GetCurrentClassLogger();
            logger.Info(message);
        }

        /// <summary>
        /// Shows and write in the console an erro message
        /// </summary>
        /// <param name="message"> message you want to show </param>
        public static void ShowErrorMessage(string message)
        {
            ConfigureLog();
            var logger = LogManager.GetCurrentClassLogger();
            logger.Error(message);
        }

        /// <summary>
        /// Shows and write in the console a warn message
        /// </summary>
        /// <param name="message"> message you want to show </param>
        public static void ShowWarnMessage(string message)
        {
            ConfigureLog();
            var logger = LogManager.GetCurrentClassLogger();
            logger.Warn(message);
        }

    }
}
