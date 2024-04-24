package edu.javacourse.exception;

public class Generator
{
    public String helloMessage(String name) throws SimpleException
    {
        if (name == null)
        {
            SimpleException se = new SimpleException(10, "Message is null");
            throw se;

            // Можно совместить создание и кидание исключения
            // throw new SimpleException(10, "Message is null");
        }

        return "Hello, " + name;
    }
}
