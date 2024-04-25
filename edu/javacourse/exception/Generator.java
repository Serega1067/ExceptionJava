package edu.javacourse.exception;

public class Generator
{
    public String helloMessage(String name) throws SimpleException, FirstException, SecondException
    {
        if (name == null)
        {
            SimpleException se = new SimpleException(10, "Message is null");
            throw se;

            // Можно совместить создание и кидание исключения
            // throw new SimpleException(10, "Message is null");
        }

        if ("FIRST".equals(name))
        {
            throw new FirstException("FirstException occured");
        }

        if ("SECOND".equals(name))
        {
            throw new SecondException("SecondException occured");
        }

        return "Hello, " + name;
    }
}
