# def_getRootDir():

import os

# def_getRootDir():
def getRootDir():
  # use data.cfg to set the data root dir.

  # assuming the cwd is in src/*
  configFile = '../../../data.cfg'

  # if not, use 'trunk' to figure it out  
  #if not os.path.isfile(configFile):
  if 1:
    cwd = os.getcwd()
    ind1 = cwd.find('JPL-WebService')
    if ind1>-1:
      cmacDir = cwd[:ind1]
      configFile = cmacDir + '/JPL-WebService/services/svc/data.cfg'

    if not os.path.isfile(configFile):
      print 'failed to find data.cfg.'
      return None 
    
  try:
    temp1 = open(configFile).read() 
    if temp1[-1]=='\n':
      temp1 = temp1[:-1]
    if temp1[-1]=='/':
      temp1 = temp1[:-1]
    if os.path.isdir(temp1):
      dataDir = temp1 + '/cmip5' 
      #a.dataDir = temp1  # should change to this when data.cfg is without 'cmip5'
      return dataDir, cmacDir
        
  except:
    print 'failed to read data.cfg.'
    return None

  print 'failed to get data.cfg.'
  return None


