package com.larsgeorge.hbase.tools;

import com.beust.jcommander.Parameter;

import java.util.List;

/**
 * Holds the parsed command line arguments.
 */
public class DifferParameters {

  @Parameter(description = "<filename1> <version1> <filename2> <version2> ...", required = true)
  public List<String> arguments = null;
  @Parameter(names = { "-h", "--help" }, description = "Print this help", help = true)
  public boolean printHelp = false;
  @Parameter(names = { "-t", "--template" }, description = "Optional template name")
  public String templateName = null;
  @Parameter(names = { "-q", "--quiet"}, description = "Only print data, no info text")
  public boolean quiet = false;

}
