﻿using LogLibrary;
using System;

namespace UtilsLibrary
{
    public class NumberUtils
    {

        /// <summary>
        /// Parse a string into an int showing log messages
        /// </summary>
        /// <param name="field"> he string you want to transform </param>
        /// <returns> an int </returns>
        public static int ToInt(string field)
        {
            try
            {
                int number = int.Parse(field);
                return number;
            }
            catch
            {
                Log.ShowErrorMessage("Can't parse int: " + field);
                throw new Exception("Can't parse int: " + field);
            }
        }

    }
}
