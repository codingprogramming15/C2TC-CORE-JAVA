import os
import openai

# Set up your OpenAI API key
openai.api_key = "YOUR_OPENAI_API_KEY"

def get_response(prompt):
    response = openai.Completion.create(
        engine="davinci",
        prompt=prompt,
        max_tokens=1024,
        temperature=0.5,
    )
    return response.choices[0].text

def main():
    while True:
        user_input = input("You:this is ai prompt ")
        response = get_response(user_input)
        print("Assistant:", response)

if __name__ == "__main__":
    main()