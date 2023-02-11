# Concurrency Tutorial

* Ex1 - creates an instance of Thread
  Provide a Runnable object. The Runnable interface defines a single method, run, meant to contain the code executed in the thread. The Runnable object is passed to the Thread constructor.
* Ex2 - creates an instance of Thread
  Subclass Thread. The Thread class itself implements Runnable, though its run method does nothing. An application can subclass Thread, providing its own implementation of run, 
  as in the HelloThread example
* Ex3 - Thread.sleep causes the current thread to suspend execution for a specified period. 
  This is an efficient means of making processor time available to the other threads of an application or other applications that might be running on a computer system. 
  The sleep method can also be used for pacing, as shown in the example that follows, and waiting for another thread with duties that are understood to have time requirements, as with the 
  SimpleThreads example in a later section.