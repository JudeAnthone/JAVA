#include <iostream>
#include <string>

using namespace std;

int user_record = 0;
const int RECORD = 10;          // Reduced the size for simplicity
string storage_data[RECORD][6]; // Removed ID, now only 6 fields

void Show_Menu();
void View_Data();
void Add_Data();

int main()
{
  int choice;

  do
  {
    Show_Menu();
    cin >> choice;

    switch (choice)
    {
    case 1:
      Add_Data();
      break;
    case 2:
      View_Data();
      break;
    case 3:
      cout << "Exiting the program.\n";
      break;
    default:
      cout << "Invalid choice. Please try again.\n";
    }
  } while (choice != 3);

  return 0;
}

void Show_Menu()
{
  cout << "\nINFORMATION SYSTEM MENU\n";
  cout << "1. Add Data\n";
  cout << "2. View Data\n";
  cout << "3. Exit\n";
}

void Add_Data()
{
  if (user_record >= RECORD)
  {
    cout << "Storage full! Cannot add more data.\n";
    return;
  }

  string name, gender, contact, address, email;
  int age;

  cout << "Enter Full Name: ";
  cin.ignore();
  getline(cin, name);
  cout << "Enter Age: ";
  cin >> age;
  cout << "Enter Gender: ";
  cin >> gender;
  cout << "Contact Number: ";
  cin.ignore();
  getline(cin, contact);
  cout << "Address: ";
  getline(cin, address);
  cout << "Email Address: ";
  cin >> email;

  storage_data[user_record][0] = name;
  storage_data[user_record][1] = to_string(age);
  storage_data[user_record][2] = gender;
  storage_data[user_record][3] = contact;
  storage_data[user_record][4] = address;
  storage_data[user_record][5] = email;
  user_record++;

  cout << "Data Added!\n";
}

void View_Data()
{
  if (user_record == 0)
  {
    cout << "No data available. Please add data first.\n";
    return;
  }

  cout << "\nALL STORED USER DATA:\n";
  for (int i = 0; i < user_record; i++)
  {
    cout << "User " << i + 1 << ":\n";
    cout << "Name: " << storage_data[i][0] << "\n";
    cout << "Age: " << storage_data[i][1] << "\n";
    cout << "Gender: " << storage_data[i][2] << "\n";
    cout << "Contact: " << storage_data[i][3] << "\n";
    cout << "Address: " << storage_data[i][4] << "\n";
    cout << "Email: " << storage_data[i][5] << "\n";
    cout << "----------------------------\n";
  }
}
