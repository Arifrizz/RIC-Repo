import subprocess
import sys

def git_add_commit(commit_message):
    try:
        # Run 'git add .' to stage all changes
        subprocess.run(["git", "add", "."], check=True)
        print("Changes added.")

        # Run 'git commit -m' to commit with a message
        subprocess.run(["git", "commit", "-m", commit_message], check=True)
        print(f"Committed with message: {commit_message}")
    
    except subprocess.CalledProcessError as e:
        print(f"Error: {e}")
        sys.exit(1)

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python git_add_commit.py '<commit_message>'")
        sys.exit(1)

    commit_message = sys.argv[1]
    git_add_commit(commit_message)

