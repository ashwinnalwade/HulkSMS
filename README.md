## HulkSMS
Bulk Message (SMS) sender for general purpose,security authentication (OTP) and also for use in village/remote areas where internet connectivity is terrible.

#APP FUNCTION

Bulk Message (SMS) sender for general purpose,security authentication (OTP) and also for use
in village/remote areas where internet connectivity is terrible.
AIM

The basic idea is to create a simple app that can send a message in bulk (that is,to multiple
users in real time).Other functionalities to be added include security authentication,image
recognition of phone numbers , and harnessing the Google calendar API to send SMS
appointment reminder alerts by integrating the app with the cloud based Twilio platform.

#TARGETED USERS

A common question arises,why not just use whatsapp to send multiple messages?

The problem is,whatsapp functions well in cities and most towns where stable wi-fi/mobile
internet is available.But villages/remote areas might not have stable internet access (or the
network could be fluctuating).Hence,keeping that in mind,This app is targeted at the following
users:

1] People in villages/remote areas where the access to wi-fi/mobile internet , IF available (a
significant part of the country still does not have access to the internet) is too slow,or
unstable.Also,since there is quite a reasonable chance that a large proportion of people residing
in villages do not own smartphones,so the app would be released in a version conforming to
normal,non-android phones too.

2] Small firms (such as a firm of chartered accountants).

3] General users, example : doctor’s appointment messages for all the patients scheduled for
that day,invitation message for a birthday party sent to multiple people....and such.

#OTHER MOTIVATIONS FOR THE APP

#Security :
There is a reason why banks send OTP and transaction info. via text messages , and not
whatsapp :

1] Higher Reach (Accessibility)

SMS service is by default supported on almost all cellphones.Services such as Whatsapp ,
however are SELECTIVE.There could be several users who may not have whatsapp installed
thus sending OTP over an app is not a chosen approach.

Also,Receiving SMS does not require user to have additional services (such as data/wi-fi access)
as required by other messenger apps.

This is crucial when it comes to villages,because while on average,villages do have decent cell
network towers most of the time,but as was mentioned earlier,we cannot say the same for
access to wi-fi (and the high charges associated with it).

2] Data Privacy (Confidentiality)

It is the bank’s responsibility to keep your data (including bank account number, passwords etc)
confidential.

Sending sensitive information over social networking platforms (whatsapp,messenger) may be
treated as violation of data privacy and confidentiality clause.Our app does not support social
networking,nor do we extract personal user data.

3] Implementation (Feasibility)

Even if the banks did want to send information via whatsapp,For sending message to whatsapp
from an application program,
Banks would require access to whatapp’s application interfaces (APIs).As of now,whatsapp has
not released their API's,so it would not be possible to send messages to whatsapp via a
program.

#APP DEVELOPMENT PHASES

#Phase 1 : Send a single sms to a user.

#Phase 2 : Send a single sms to multiple users via a user array.

#Phase 3 : Send a single sms to multiple users by extracting users from a database.

#Phase 4 : Send a single sms to multiple users by importing contacts from various soruces.

#Phase 5 : Include image recognition of phone number + Integrate with Twilio for further
enhancements. (Obviously,This functionality of the app requires access to wi-fi.)

For the PDF version , see : https://drive.google.com/file/d/0B29eWrbvt6KOY1JHRzM3NFdISHM/view
